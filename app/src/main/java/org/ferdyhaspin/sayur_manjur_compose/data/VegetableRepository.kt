package org.ferdyhaspin.sayur_manjur_compose.data

import android.content.Context
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import org.ferdyhaspin.sayur_manjur_compose.model.OrderVegetable
import org.ferdyhaspin.sayur_manjur_compose.model.dummyVegetable

/**
 * Created by ferdyhaspin on 14/12/22.
 */
class VegetableRepository(context: Context) {

    private val orderVegetables = mutableListOf<OrderVegetable>()

    init {
        if (orderVegetables.isEmpty()) {
            context.dummyVegetable().vegetables.forEach {
                orderVegetables.add(OrderVegetable(it, 0))
            }
        }
    }

    fun getAllVegetables(): Flow<List<OrderVegetable>> {
        return flowOf(orderVegetables)
    }

    fun getOrderVegetableById(vegetableId: Int): OrderVegetable {
        return orderVegetables.first {
            it.vegetable.id == vegetableId
        }
    }

    fun updateOrderVegetable(vegetableId: Int, newCountValue: Int): Flow<Boolean> {
        val index = orderVegetables.indexOfFirst { it.vegetable.id == vegetableId }
        val result = if (index >= 0) {
            val orderVegetable = orderVegetables[index]
            orderVegetables[index] =
                orderVegetable.copy(vegetable = orderVegetable.vegetable, count = newCountValue)
            true
        } else {
            false
        }
        return flowOf(result)
    }

    fun getAddedOrderVegetables(): Flow<List<OrderVegetable>> {
        return getAllVegetables()
            .map { orderVegetables ->
                orderVegetables.filter { orderVegetable ->
                    orderVegetable.count != 0
                }
            }
    }

    companion object {
        @Volatile
        private var instance: VegetableRepository? = null

        fun getInstance(context: Context): VegetableRepository =
            instance ?: synchronized(this) {
                VegetableRepository(context).apply {
                    instance = this
                }
            }
    }
}